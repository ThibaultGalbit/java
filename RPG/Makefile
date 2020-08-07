JC	=	javac

.SUFFIXES	:	.java	.class
.java.class	:
				$(JC)	$(JFLAGS)	$*.java

CLASSES		=	entities/Enemy.java	\
				entities/Entities.java	\
				entities/Player.java	\
				App.java

default		:	classes

classes		:	$(CLASSES:.java=.class)

fclean		:
				$(RM)	$(CLASSES:.java=.class)