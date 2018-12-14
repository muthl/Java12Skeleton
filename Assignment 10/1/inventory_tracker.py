#run in command line
#will have options: 
#enter one of the following choices:
#1 Create entry
#2 View inventory.
#6 Exit

#video store rental entries
from item import Item
import jsonpickle
inventory_file_name = "inventory.txt"

inventory = []

inventory.append(Item("Star Wars", "1973", "5.00", "Sci-Fi", "4", "None"))
inventory.append(Item("Predator", "1985", "5.00", "Thriller", "2", "None"))

def load_inventory_json(inventory):
    inventory.clear()   #empties list.
    inventory_file = open('inventory.json', 'r')
    inventory = jsonpickle.decode(inventory_file.read())
    inventory_file.close()
    return inventory

def save_inventory_json(inventory):
    inventory_file = open('inventory.json', 'w')
    json_string = jsonpickle.encode(inventory)
    inventory_file.write(json_string)
    inventory_file.close()

def create_new_item():
    title = input("Input Movie Title: ") #inputer = string variable title
    year = input("Input Release Year: ")
    price = input("Input Rent Price: ")
    genre = input("Input Genre: ")
    shelf_number = input("Input Shelf Number: ")
    current_renter = input("Current Renter: ")
    
    item = Item(title, year, price, genre, shelf_number, current_renter)
    inventory.append(item) #apend that item instance to the inentory array
    save_inventory_json(inventory) #call the save_inventory function

    

    
    


save_inventory_json(inventory)

"""def load_inventory():
    inventory.clear
    inventory_file = open(inventory_file_name, 'r')
    for line in inventory_file.readlines():
        item_array = line.split('\t')
        for x in range(len(item_array)):
            inventory.append(Item(item_array[0], item_array[1], item_array[2], item_array[3], item_array[4], item_array[5]))
    inventory_file.close() """


""" def save_inventory():
    inventory_file = open(inventory_file_name, 'w')
    for i in inventory:
        item_string = str(i.title) + '\t' + str(i.year) + '\t' + str(i.price) + '\t' + str(i.genre) +'\t' + str(i.shelf_number) + '\t' + str(i.current_renter) + '\n' 
        inventory_file.write(item_string)
    inventory_file.close()
    pass """
inventory = load_inventory_json(inventory)

def print_inventory():
    print("Title", "\tYear", "Price", "Genre", "Shelf Number", "Current Renter", sep="\t")
    for i in inventory:
        print(i.title, i.year, i.price, i.genre, i.shelf_number, i.current_renter, sep="\t")

while True:
    print("choose an option:")
    print("1. Create/add invetory item")
    print("2. View inventory")
    print("3. Exit")
    choice = input(">")
    if choice == '3':
        break
    elif choice == '2':
        print_inventory()
    elif choice == '1':
        create_new_item()
