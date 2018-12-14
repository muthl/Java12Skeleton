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

inventory.append(Item("Star Wars", "1973", "5.00", "Sci-Fi", "4", "John"))
inventory.append(Item("Predator", "1985", "5.00", "Thriller", "2", ""))


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

def edit_entry():
    search = input("Input Movie Title:\n")
    for i in inventory:
        if i.title.lower() == search.lower():   #converts to all lower case when checking if equal
            print(i.title, i.year, i.price, i.genre, i.shelf_number, i.current_renter, sep="\t")

            while True:
                print("1. Title, 2.Year, 3.Price, 4 Genre, 5.Shelf Number, 6.Current Renter 7.Menu")
                choice = input(">")
                if choice == '1':
                    title = input("Input Movie Title: ")
                    i.title = title
                elif choice == '2':
                    year = input("Input Release Year: ")
                    i.year = year
                elif choice == '3':
                    price = input("Input Rent Price: ")
                    i.price = price
                elif choice == '4':
                    genre = input("Input Genre: ")
                    i.genre = genre 
                elif choice == '5':
                    shelf_number = input("Input Shelf Number: ")
                    i.shelf_number = shelf_number
                elif choice == '6':
                    current_renter = input("Current Renter: ")
                    i.current_renter = current_renter
                elif choice == '7':
                    break
                else:
                    pass
    save_inventory_json(inventory) #call the save_inventory function    
    return


    

    
    
save_inventory_json(inventory)

def TotalCharged(inventory):
    total = 0
    for i in inventory:
        if i.current_renter != "":
            total = total + float(i.price)
    return total

def titleSearch():
    search = input("Input Movie Title:\n")
    for i in inventory: 
        if i.title.lower() == search.lower():
            print(i.title, i.year, i.price, i.genre, i.shelf_number, i.current_renter, sep="\t")
            return 
    print("nothing found")




inventory = load_inventory_json(inventory)

def print_inventory():
    print("Title", "\tYear", "Price", "Genre", "Shelf Number", "Current Renter", sep="\t")
    for i in inventory:
        print(i.title, i.year, i.price, i.genre, i.shelf_number, i.current_renter, sep="\t")



while True:
    print("choose an option:")
    print("1. Exit")
    print("2. View inventory")
    print("3. Create/add invetory item")
    print("4. Total cost of rented movies")
    print("5. Search")
    print("6. Edit Inventory by movie title")
    print()
    choice = input(">")
    if choice == '1':
        break
    elif choice == '2':
        print_inventory()
    elif choice == '3':
        create_new_item()
    elif choice == '4':
        print(TotalCharged(inventory))
        print()
    elif choice == '5':
        titleSearch()
    elif choice == '6':
        edit_entry()
    else:
        print("Invalid Input")



