#allow for printing out
##include '#include "print.h" ' for each header file
##that calls the printf function
#CFLAGS += -I$(TOSDIR)/lib/printf

## change printf buffer size
#CFLAGS += -DPRINTF_BUFFER_SIZE=256

BUILD_EXTRA_DEPS = Main.class

Main.class: DemoAppMsg.java
	javac *.java 

DemoAppMsg.java: ../DemoApp.h
	nescc-mig java -java-classname=DemoAppMsg ../DemoApp.h demo_message -o $@

clean:
	rm -f DemoAppMsg.java  *.class
