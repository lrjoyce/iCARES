## original below
# COMPONENT=DemoAppC
# CFLAGS += -I$(HOME)/tinyos-main/tos/lib/printf
# TINYOS_ROOT_DIR?=../../..
# include $(TINYOS_ROOT_DIR)/Makefile.include
## Need to add line below. see http://mail.millennium.berkeley.edu/pipermail/tinyos-devel/2004-September/000501.html 
# include $(MAKEFULES)


##LRJ is troubleshooting below

COMPONENT=DemoAppC

#be able to print an output
CFLAGS += -I$(HOME)/tinyos-main/tos/lib/printf

#SENSORBOARD=telosb

#include $(MAKERULES)


#didn't work - .. x6, or 5, or 4, or 3
#TINYOS_ROOT_DIR?=../../..
#TINYOS_ROOT_DIR?=/home/liam/tinyos-main/tos/platforms/telosb/mac/tkn154
TINYOS_ROOT_DIR?=/home/liam/tinyos-main/support/sdk/java


# this line is original
include $(TINYOS_ROOT_DIR)/Makefile.include

include $(MAKERULES)
