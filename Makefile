UNITTESTS = test_all

.SILENT:

all:
	echo "Compiling Java source files"
	ant build
	echo "Generating jar file"
	ant build-jar

gen:
	ant generate

build:
	ant build

jar:
	ant build-jar

unit: all
	for tst in $(UNITTESTS); do \
		make $$tst; \
	done

test_%: all 
	echo "Running test" $@
	java -cp plp1.jar:lib/junit4.jar:lib/hamcrest2.jar:/usr/share/java/antlr4-runtime.jar org.junit.runner.JUnitCore test.$@

clean:
	echo "Cleaning up class files and jar file"
	ant clean

