while True:
    Player1=input("Player 1, Select an option from: Rock, Scissor or Paper: ").lower()
    Player2=input("Player 2, Select an option from: Rock, Scissor or Paper: ").lower()

    if Player1==Player2:
        print("Its a tie")
    elif Player1=="rock":  
        if Player2=="scissor":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    elif Player1=="paper":
        if(Player2=="rock"):
            print("Player 1 win")
        else:
            print("Player 2 wins")
    elif Player1=="scissor":
        if Player2=="paper":
            print("Player 1 wins")
        else:
            print("Player 2 wins")
    else:
        print("Invalid input!")
    playagain=input("Do you want to play again? (yes/no): ")
    if playagain!="yes":
        print("Thanks for playing")
        break