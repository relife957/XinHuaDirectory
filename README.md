# XinHuaDirectory
可以在终端使用的新华字典

## api接口
该程序使用的api接口是[chinese-xinhua](https://github.com/pwxcoo/chinese-xinhua)提供的

## 介绍
看到上面提到的api接口后,在加上我一直使用的一个终端单词翻译工具[ydcv](https://github.com/felixonmars/ydcv)
就想做一个在终端使用的新华字典,现在已经实现
### 效果图
效果图在github上不好看，可以在博客上看一下
[博客](https://blog.csdn.net/qq_36865108/article/details/81951357)
## 使用
在XinHuaDirectory/下有个脚本start.sh,
在bash下,先给start.sh权限,chomd +x ./start.sh ,
然后运行脚本,该脚本需要两个参数,type,value解释一下,
当你运行(命令)xinhua type后,会出现一个">",在">"后写下value,就会出现查询结果,如果想要正常退出,输入":quit"就可以了
## 将脚本做成系统命令
看这篇博客[脚本做成系统命令](https://blog.csdn.net/hxbguoke/article/details/47664153)
将脚本做成系统命令前,记得将脚本中的相对路径该为绝对路径,否则会出错.
我做成了xinhua这个命令
#### type的值有四种:
1. idiom 成语查询,对应的value是一个具体的成语
    例:  xinhua idiom 
            >讳莫如深
2. idiom2 成语查询,对应的value是一个成语名的缩写
    例:  xinhua idiom2
            >hmrs
3. xiehouyu 歇后语查询，对应的value是一个词语，支持模糊查询
    例:  xinhua xiehouyu
            >王婆
4. word 字查询，对应的value是一个字
    例: xinhua word
            >饕.

## 最后
已经改为终端模式
