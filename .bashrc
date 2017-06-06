# setup tinyos environment

TOSROOT= /home/liam/tinyos-main/
TOSDIR="$TOSROOT/tos"
MAKERULES="$TOSROOT/support/make/Makesrules"
CLASSPATH=$TOSROOT/tools/tinyos/java/tinyos.jar:$CLASSPATH
PYTHONPATH=$TOSROOT/tools/tinyos/python:$PYTHONPATH

export TOSROOT
export TOSDIR
export CLASSPATH
export PYTHONPATH
