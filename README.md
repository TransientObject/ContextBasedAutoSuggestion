Team #23

TOPIC - CONTEXT BASED AUTO SUGGESTION IN A CHAT APPLICATION

CONTENTS OF THE SUBMISSION

1) CODE FOR CHAT APPLICATION (Ruby on Rails)
2) CODE FOR DETECTING CONTEXT (Java)

3) README file (this file) that explains how to install and run the project


I) Installing the Chat Application. 

The code for chat application is in the directory context_based_autosuggestion.

Requirements - Ubuntu 13.04, Ruby, Rails, Bundler

1) cd into the folder and run bundle install
2) Run rake db:create
3) Run rake db:migrate

4) Open a new terminal and run, rails server
5) Open another terminal and run, rails g private_pub:install
6) Run "rackup private_pub.ru -s thin -E production" in the same terminal

Chat application can be accessed in http:/localhost:3000/messages

II) Installing the context deduction part

For this, we need to install a plugin called MALLET. Its Machine Learning for Language ToolKit

Download Mallet for linux from http://mallet.cs.umass.edu/dist/mallet-2.0.7.tar.gz
untar and install using "make" and "make all"

Once this is installed, 

1) Open the AI_Proj folder in eclipse. Make sure all plugins are properly loaded. 
2) Import jar files from JAR files directory
3) Run the project.


II) Testing the working


Now that the project is set up and both components are up and running, start chatting using the app. There's no concept of who chats with who. Its just two windows that gets updates on each chat. After typing few lines, refresh the page to get new suggestions

The chat content has been written to a file which is read by the java application which gets the context and writes the autosuggestion values into another file, which is then used by the chat application. Since the javascript opens the file onload of the DOM, refreshing has to be done to get new suggestions.

Context is populated for the following topics. Try and stick to them. 

1) AI(General, ML, Neural Nw, Search Methods, Minmax-alphabeta)
2) Cricket(general, indian cricket, sachin, dhoni, ipl)
3) Football(general, TAMU football, NFL, Manziel)
4) Soccer(General, FIFA, BPL, Ronaldo, Messi, Manchester United) 
5) US(General, Obama) 
6) Technology(Software ENgg, Database, Java, C++
7) companies(google,microsoft,facebook)

Screenshots are attached in the home folder of this directory structure.