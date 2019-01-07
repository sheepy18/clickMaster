#####################################################################
#For Java projects:

NAME = Main
OBJ = obj
COMP = javac
COMPFLAGS = -g -verbose -d obj/ -cp src/view

default::$(NAME)

$(OBJ):
	mkdir $@
$(OBJ)/$(NAME).class: src/$(NAME).java src/src.view/Menu.java | $(OBJ)
	$(COMP) $(COMPFLAGS) $^
$(NAME): $(OBJ)/$(NAME).class | $(OBJ)
	

clean:
	rm -rf $(OBJ)
run:
	java -cp obj $(NAME)
