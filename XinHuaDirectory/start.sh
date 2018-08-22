 #!/bin/bash
 type="$1"
 value="$2"
 DIRNAME=$0
 if [ "{DIRNAME:0:1}" = "/" ]; then
    CURDIR=`dirname $DIRNAME`
else
    CURDIR="`pwd`"/"`dirname $DIRNAME`"
fi
 java -jar $CURDIR/target/XinHuaDirectory.jar $type $value
 
