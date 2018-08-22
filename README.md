# XinHuaDirectory
可以在终端使用的新华字典

## api接口
该程序使用的api接口是[chinese-xinhua](https://github.com/pwxcoo/chinese-xinhua)提供的

## 介绍
看到上面提到的api接口后,在加上我一直使用的一个终端单词翻译工具[ydcv](https://github.com/felixonmars/ydcv)
就想做一个在终端使用的新华字典,但是能力受限,
并没有做成ydcv一样的效果,只是做成了脚本形式,
以后一定改成真正的终端模式

## 使用
在XinHuaDirectory/下有个脚本start.sh,
在bash下,先给start.sh权限,chomd +x ./start.sh ,
然后运行脚本,该脚本需要两个参数,type和value,解释一下,
#### type的值有四种:
1. idiom 成语查询,对应的value是一个具体的成语
    例:  ./start.sh idiom 讳莫如深
2. idiom2 成语查询,对应的value是一个成语名的缩写
    例:  ./start.sh idiom2 hmrs
3. xiehouyu 歇后语查询，对应的value是一个词语，支持模糊查询
    例:  ./start.sh xiehouyu 王婆
4. word 字查询，对应的value是一个字
    例: ./start.sh word 饕

## 最后
等我弄懂终端模式，一定很快改完，脚本真是太蠢了
