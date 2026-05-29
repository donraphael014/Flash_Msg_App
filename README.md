Flash Msg - Application de Chat en Temps Réel
Présentation
Flash Msg est une plateforme de messagerie instantanée développée avec Spring Boot et la technologie WebSocket, permettant aux utilisateurs d'échanger des messages en direct.

Fonctionnalités principales

Envoi et réception de messages instantanés entre utilisateurs

Notification des connexions et déconnexions des participants

Interface utilisateur épurée et facile à prendre en main

Technologies utilisées

Côté serveur :

Java 21 (version LTS)

Spring Boot 3 (framework principal)

WebSocket Spring pour la communication bidirectionnelle

Spring Data JPA (gestion des données)

Base de données H2 (stockage temporaire)

Maven (gestionnaire de dépendances)

Côté client :

Thymeleaf (génération des pages dynamiques)

HTML5, CSS3, JavaScript (structure, style, interactivité)

StompJS (client WebSocket)

Procédure d'installation et lancement

Configuration requise :

Java Development Kit (JDK) version 21 ou supérieure

Maven 3.2 ou version plus récente

Étapes à suivre :

Récupération du code source

bash
git clone https://github.com/codingwitharmand/chat-app.git
Accès au répertoire du projet

bash
cd chat-app
Démarrage de l'application

bash
./mvnw spring-boot:run
Utilisation de l'application
Ouvrez votre navigateur internet et saisissez l'adresse suivante : http://localhost:8080

Note importante : Assurez-vous qu'aucune autre application n'utilise le port 8080 avant de lancer Flash Msg.



