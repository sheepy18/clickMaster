#####################################################################
#For Java projects:

NAME = Main
OBJ = obj
COMP = javac
COMPFLAGS = -g -verbose -d obj/ 
src = $(wildcard src/*.java)
view = $(wildcard src/src.view/*.java)
model = $(wildcard src/src.model/*.java)


default:$(OBJ)/Main.class

all: $(src) $(view)

$(OBJ):
	mkdir $@
$(OBJ)/Main.class: $(src) $(view) $(model) | $(OBJ)
	$(COMP) $(COMPFLAGS) $^
	

clean:
	rm -rf $(OBJ)
run:
	java -cp obj $(NAME)
