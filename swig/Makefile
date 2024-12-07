# Makefile for SWIG Java Binding

# Java and SWIG paths
JAVA_HOME ?= /usr/lib/jvm/java-17-openjdk-amd64
SWIG = swig

# Compiler settings
CXX = g++
CXXFLAGS = -fPIC -std=c++11 -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/linux

# Source files
NATIVE_SRC = ../native/game_engine.cpp
SWIG_SRC = ../native/game_engine.i

# Output settings
TARGET = libgame_engine
JAVA_OUT = ../src/com/mariogame/native_binding

all: java_binding

java_binding:
	# Generate Java wrapper
	$(SWIG) -c++ -java -package com.mariogame.native_binding \
		-outdir $(JAVA_OUT) \
		-o game_engine_wrap.cpp \
		$(SWIG_SRC)
	
	# Compile C++ to shared library
	$(CXX) $(CXXFLAGS) -shared \
		$(NATIVE_SRC) game_engine_wrap.cpp \
		-o $(TARGET).so

clean:
	rm -f game_engine_wrap.cpp
	rm -f $(JAVA_OUT)/*.java
	rm -f $(TARGET).so