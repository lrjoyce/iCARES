Place 'SourceCode' in the 'tinyos-main/apps' directory. Check to make sure that the Makefiles in Mote and Basestation are correct for your machine. 

There are three pieces of source code contained in this directory. The Mote and Basestation programs are TinyOS applications that can be loaded onto a mote platform using the command:

make [mote-type] reinstall

Where [mote-type] is micaz, micazsim, telos, telosb, etc.

The java application designed to be run on the basestation PC is contained in the Basestation directory. For first time users, please navigate to Basestation/java and run:

make

To run the java application called Main, run:

java Main

The mote with Basestation being run on it should be plugged into the PC running the java application.
