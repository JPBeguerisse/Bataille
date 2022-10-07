Read me
Ce projet consiste à programmer une bataille de carte entre 2 joueurs.
Il est composé de 4 classes :
La classe carte qui regroupe les différents attributs qui sont les couleurs et les valeurs des cartes, le constructeur de carte et les méthodes get qui retourne la valeur et la couleur d'une carte.

La classe joueur qui regroupe le nom du joueur, son score de point et les cartes à sa maim.
Il y'a aussi les méthodes ajouter une carte, les méthodes qui incrémentent le nombre de point du joueur ( gagnerPoint, perdrePoint), une méthode qui permette de savoir le nombre de point du joueur et la méthode getNom qui retourne son nom.

La classe paquet permet de créer un paquet de 52 cartes et de l'initiation avec la méthode initPaquet puis la mélanger avec la méthode mélanger qui tire les cartes aléatoirement. On y trouve aussi la méthode estVide qui vérifie si le paquet est vide et getNbcartes pour savoir le nombre de carte dans le paquet.

La classe Bataille qui contient notre main et dans laquelle on créer des joueurs et on initialise un paquet de 52 cartes tiré aléatoirement. Dans cette classe on devait implémenter le fait que 2 joueurs puisse jouer et de savoir qui sera le vainqueur ce qui n'a pas pu être fait.