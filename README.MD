![banner](images/bleach-banner.png)

*Bleach is an anti-cheat plugin for minecraft servers developped by N3RO.*

### I. Instructions

#### 1. Setting up eclipse

##### a) Get the files
First, open a terminal, go to the "Bleach" folder (create it if it doesn't exist) and write :
> - git init
> - git clone git@gitlab-ce.iut.u-bordeaux.fr:lgallon/Bleach.git

If you don't have any terminal that accepts git commands, download the archive containing the files, and extrat everything in the "Bleach"  folder (create it if it doesn't exist).

##### b) Set up eclipse

Open Eclipse, set the working directory in the Bleach/ folder. Create a new java project named "Bleach", and the, reload src/.

#### 2. Setting up the server

Click on setup_server.bat

#### 3. Exporting the plugin

In Eclipse, File>Export>Java>JAR File, once the "JAR Export" window appears, select "Bleach" folder, and set the JAR File path to Server/plugins. Then click on finish.

### II. Goal of the project

#### 1. Description

Since the main developper Lilian Gallon (N3RO) developped hacks to understand how it works, the anti-cheat will catch the player using the issues at their advantages.
The main feature of the anticheat is to give a suspicious percentage to every player. The anticheat will adapt its behaviour according to every player, and store the informations.
If a gap is reached, the player that reached the gap could be send to admins, or even could be immediatly banned.

#### 2. Releases

Releases are available in the Releases folder. Please check CHANGELOG.MD to get the informations about the updates.

#### 3. Goals

The goal is to use [N3RO Ghost client](https://gitlab-ce.iut.u-bordeaux.fr/lgallon/GhostClient) and [N3RO BetterColors](https://gitlab-ce.iut.u-bordeaux.fr/lgallon/Bettershadows) and to make them detected. Those are undetected on the biggest minecraft servers.
- [ ] Speed anticheat
- [ ] Reach anticheat
- [ ] Fast click anticheat
- [ ] Spam detection
- [ ] Aimbot anticheat
- [ ] Killaura bot anticheat (catch a player using killaura)
- [ ] Movement anticheat (fly/step)
- [ ] Packet abuse anticheat (used in hacked client to bridge faster and to improve the player's reach)

### III. Misc

[Spigot documentation)(https://hub.spigotmc.org/javadocs/spigot/)

Developpment status for 1.0 release:
- [x] Commands system *(26/07/18 | v.0.1)*
- [x] Log system *(28/07/18 | v.0.2)*
- [x] Event system *(28/07/18 | v.0.2)*
- [ ] File manager system
- [ ] AC Module system