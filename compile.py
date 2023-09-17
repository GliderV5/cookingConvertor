import os
os.system("clear")
os.system("javac -d bin src/script/*.java")
print("")
print("######## Lancement du programme ########")
print("")
os.system('java -cp bin/ script.Cuisine')
print()
if input("creat a jar file ? (y/n) : ") == "y":
    os.system("jar cvfm cookingConvertor.jar manifest.txt -C bin/ .")
    print("jar file created")