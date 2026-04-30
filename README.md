# Systeme de gestion de bibliotheque en Java

## Description

Ce projet est une application Java en console permettant de gerer une bibliotheque.

L'utilisateur peut ajouter des livres, afficher la liste des livres, emprunter un livre, retourner un livre et rechercher un livre grace a son identifiant.

Le projet utilise la programmation orientee objet avec plusieurs classes separees afin de rendre le code plus clair et plus organise.

## Fonctionnalites

- Ajouter un livre avec un titre, un auteur et un identifiant
- Afficher la liste des livres sous forme de tableau
- Emprunter un livre
- Retourner un livre
- Rechercher un livre avec son identifiant
- Verifier si un livre est disponible ou deja emprunte
- Afficher des messages colores dans la console
- Gerer les erreurs simples avec `try/catch`

## Technologies utilisees

- Java
- Programmation orientee objet
- ArrayList
- Scanner
- Console

## Structure du projet

```text
ynov-java-tp/
│
├── Main.java
├── Bibliotheque.java
├── Livre.java
├── ConsoleColors.java
├── .gitignore
└── README.md
```

## Role des fichiers

### Main.java

Le fichier `Main.java` contient le menu principal de l'application.

Il permet a l'utilisateur de choisir une action parmi les options suivantes :

1. Ajouter un livre
2. Afficher les livres
3. Emprunter un livre
4. Retourner un livre
5. Rechercher un livre
6. Quitter

Ce fichier gere aussi les saisies utilisateur avec `Scanner` et les erreurs de saisie avec un bloc `try/catch`.

### Bibliotheque.java

Le fichier `Bibliotheque.java` contient la classe `Bibliotheque`.

Cette classe gere la liste des livres avec une `ArrayList`.

Elle contient les methodes permettant de :

- Ajouter un livre
- Afficher tous les livres
- Emprunter un livre
- Retourner un livre
- Rechercher un livre par identifiant

### Livre.java

Le fichier `Livre.java` contient la classe `Livre`.

Chaque livre possede :

- Un titre
- Un auteur
- Un identifiant
- Un etat de disponibilite

La classe contient aussi des methodes pour emprunter, retourner et afficher un livre.

### ConsoleColors.java

Le fichier `ConsoleColors.java` contient des constantes permettant d'ajouter des couleurs dans la console.

Les couleurs utilisees sont :

- Rouge pour les erreurs
- Vert pour les succes ou les livres disponibles
- Jaune pour certaines saisies
- Cyan pour les titres et les separations
- Gras pour mettre en valeur certains textes

## Prerequis

Avant de lancer le projet, il faut avoir Java installe sur la machine.

Version recommandee :

```text
Java 17
```

Pour verifier si Java est bien installe :

```bash
java -version
javac -version
```

Les deux commandes doivent afficher une version compatible, par exemple :

```text
java version "17..."
javac 17...
```

Si `javac` est en Java 17 mais que `java` est en Java 8, le programme peut afficher une erreur de version. Il faut alors utiliser la meme version de Java pour compiler et executer le projet.

## Comment lancer le projet

### 1. Ouvrir un terminal

Se placer dans le dossier du projet :

```bash
cd chemin/vers/ynov-java-tp
```

### 2. Supprimer les anciens fichiers compiles

Cette etape est utile si des fichiers `.class` existent deja.

Sous Windows PowerShell :

```powershell
del *.class
```

Sous Linux, macOS ou Git Bash :

```bash
rm *.class
```

### 3. Compiler le projet

```bash
javac *.java
```

Cette commande compile tous les fichiers Java du projet :

```text
Main.java
Bibliotheque.java
Livre.java
ConsoleColors.java
```

### 4. Executer le programme

```bash
java Main
```

Le menu de l'application s'affiche ensuite dans la console.

## Commandes completes

### Windows PowerShell

```powershell
cd "chemin\vers\ynov-java-tp"
del *.class
javac *.java
java Main
```

### Linux, macOS ou Git Bash

```bash
cd chemin/vers/ynov-java-tp
rm *.class
javac *.java
java Main
```

## Exemple d'utilisation

```text
===== MENU BIBLIOTHEQUE =====
 1. Ajouter un livre
 2. Afficher les livres
 3. Emprunter un livre
 4. Retourner un livre
 5. Rechercher un livre
 6. Quitter

Votre choix : 1
Titre du livre : Harry Potter
Auteur du livre : J.K Rowling
Identifiant du livre : 1
Livre ajoute avec succes.
```

Puis l'utilisateur peut afficher les livres :

```text
Votre choix : 2
```

Resultat attendu :

```text
LISTE DES LIVRES
==========================================================================
| ID    | Titre                     | Auteur               | Etat         |
--------------------------------------------------------------------------
| 1     | Harry Potter              | J.K Rowling          | Disponible   |
==========================================================================
Nombre total de livres : 1
```

## Exemple de scenario de test

Pour tester rapidement le programme :

1. Ajouter un livre
2. Afficher la liste des livres
3. Emprunter le livre
4. Afficher la liste pour verifier qu'il est emprunte
5. Retourner le livre
6. Afficher la liste pour verifier qu'il est disponible
7. Rechercher le livre par son identifiant
8. Quitter le programme

## Commande de test rapide

Sous Linux, macOS ou Git Bash :

```bash
printf "1\nHarry Potter\nJ.K Rowling\n1\n2\n3\n1\n2\n4\n1\n2\n5\n1\n6\n" | java Main
```

Cette commande teste automatiquement :

- L'ajout d'un livre
- L'affichage des livres
- L'emprunt d'un livre
- Le retour d'un livre
- La recherche d'un livre
- La sortie du programme

## Gestion des erreurs

Le programme gere plusieurs erreurs simples :

- Si l'utilisateur entre un choix invalide
- Si l'utilisateur entre une valeur non numerique pour un identifiant
- Si un livre recherche n'existe pas
- Si un livre est deja emprunte
- Si un livre est deja disponible
- Si un identifiant est deja utilise lors de l'ajout d'un livre

## Probleme possible avec Java

Si cette erreur apparait :

```text
UnsupportedClassVersionError
```

Cela signifie souvent que le projet a ete compile avec une version recente de Java, mais execute avec une version plus ancienne.

Exemple :

```text
javac 17
java 8
```

Dans ce cas, il faut soit utiliser Java 17 pour executer le programme, soit recompiler avec une version compatible Java 8 :

```bash
javac --release 8 *.java
java Main
```

Il est recommande d'utiliser la meme version pour `java` et `javac`.

## Gitignore

Le projet peut contenir un fichier `.gitignore` pour eviter d'ajouter les fichiers compiles au depot Git.

Exemple :

```gitignore
*.class
```

Les fichiers `.class` sont generes automatiquement par la commande `javac`, ils n'ont donc pas besoin d'etre envoyes sur Git.

## Objectif pedagogique

Ce projet permet de mettre en pratique :

- Les classes et les objets
- L'encapsulation
- Les conditions
- Les boucles
- Le `switch`
- Les collections avec `ArrayList`
- La gestion simple des exceptions
- L'organisation d'un projet Java en plusieurs fichiers

## Auteur

Projet realise dans le cadre d'un TP Java sur la gestion d'une bibliotheque.
