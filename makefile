#####################################################################
#For Java projects:

NAME = Main
OBJ = obj
COMP = javac
COMPFLAGS = -g -verbose -d obj/

default::$(NAME)

$(OBJ):
	mkdir $@
$(OBJ)/$(NAME).class: src/$(NAME).java | $(OBJ)
	$(COMP) $(COMPFLAGS) $<
$(NAME): $(OBJ)/$(NAME).class | $(OBJ)
	

clean:
	rm -rf $(OBJ)
run:
	java -cp obj $(NAME)
