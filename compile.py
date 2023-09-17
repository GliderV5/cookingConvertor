import os
os.system("clear")
os.system("javac -d bin src/*.java")
print("")
print("######## Lancement du programme ########")
print("")
os.system('java -cp bin/ script.Cuisine')