#####################################################################
#For Java projects:

NAME = Main
OBJ = obj
COMP = javac
COMPFLAGS = -g -verbose -d obj/ 
src = $(wildcard src/*.java)
view = $(wildcard src/src.view/*.java)
model = $(wildcard src/src.model/*.java)
srcuml = $(wildcard uml/view/*.puml) $(wildcard uml/model/*.puml) $(wildcard uml/controller/*.puml)


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
puml:
	java -jar ~/plantuml.jar $(srcuml)
