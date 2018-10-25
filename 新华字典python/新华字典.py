#!/usr/bin/env python

import requests

class ExitException(Exception):
    pass

baseUrl = "https://www.pwxcoo.com/dictionary"

def getType():
    type = input("输入查询类型(汉字,成语,拼音成语(首字母),歇后语)(结束请输入quit): ").strip()
    if type == 'quit':
        raise ExitException
    type_value = ""
    type_value_2 = ""

    if type=="汉字" :
        type_value = 'word'
        type_value_2 = 'word'
    elif type == "成语":
        type_value = 'idiom'
        type_value_2 = 'word'
    elif type == "拼音成语":
        type_value = 'idiom'
        type_value_2 = 'abbreviation'
    elif type == '歇后语':
        type_value = 'xiehouyu'
        type_value_2 = 'riddle'

    word = input("输入查询的词或歇后语前缀: ").strip()

    param = {
        'type':type_value ,
        type_value_2:word
    }

    return param

def getData():
    param = getType()

    res = requests.get(baseUrl,params=param)

    if res.status_code == 200 :
        return res.json()
    return "failure"

def parse():
    data = getData()
    if data =='failure' or data==[]:
        raise Exception("failure")
    for dicts in data :
        for item in dicts.items():
            print(item[0]+" : "+str(item[1]))



def main():
    while True:
        try:
            parse()
        except ExitException :
            break
        except :
            print("请检查输入格式或者您需要的内容不存在")


if __name__ == '__main__':
    main()