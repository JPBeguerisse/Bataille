Read me
Ce projet consiste � programmer une bataille de carte entre 2 joueurs.
Il est compos� de 4 classes :
La classe carte qui regroupe les diff�rents attributs qui sont les couleurs et les valeurs des cartes, le constructeur de carte et les m�thodes get qui retourne la valeur et la couleur d'une carte.

La classe joueur qui regroupe le nom du joueur, son score de point et les cartes � sa maim.
Il y'a aussi les m�thodes ajouter une carte, les m�thodes qui incr�mentent le nombre de point du joueur ( gagnerPoint, perdrePoint), une m�thode qui permette de savoir le nombre de point du joueur et la m�thode getNom qui retourne son nom.

La classe paquet permet de cr�er un paquet de 52 cartes et de l'initiation avec la m�thode initPaquet puis la m�langer avec la m�thode m�langer qui tire les cartes al�atoirement. On y trouve aussi la m�thode estVide qui v�rifie si le paquet est vide et getNbcartes pour savoir le nombre de carte dans le paquet.

La classe Bataille qui contient notre main et dans laquelle on cr�er des joueurs et on initialise un paquet de 52 cartes tir� al�atoirement. Dans cette classe on devait impl�menter le fait que 2 joueurs puisse jouer et de savoir qui sera le vainqueur ce qui n'a pas pu �tre fait.