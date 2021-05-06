age = int(input("Qual a sua idade? \n"))
if age >= 5 and age < 8:
    cat = "Infantil A"
elif age >= 8 and age <= 10:
    cat = "Infantil B"
elif age >= 11 and age <= 13:
    cat = "Juvenil A"
elif age >= 14 and age < 17:
    cat = "Juvenil B"
else:
    cat = "Senior"

print("A sua categoria é:",cat)
