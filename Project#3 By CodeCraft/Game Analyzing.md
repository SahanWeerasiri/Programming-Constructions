![[UPDATED OOP Project_ Mystic Mayhem.pdf]]

Game
	user
		user name
			 cannot be changed once created. 
			 The username is a unique value; no two players can have the same username. 
			 If an attempt is made to create a new player profile with an existing username, the user should be notified that the username is already taken and should be prompted to enter a new username. 
		user ID
			unique integer userID
			 which should be given by the system.
		name (can be changed any time)
		gold coins
			default 500
			when two players combat, the winner gets 10% of the loser’s coins.
			In case of a draw, no coins are exchanged
			can use to buy items(army and equipment)
		XP
			default 0
			winning a match increases it by 1
		Army
			 Archer
			 a Knight
			 a Mage
			 a Healer
			 a Mythical Creature
			default 0
			when buying new one existing character should be sold and get 90% of its original price and replace the character
		equipment
			each of one has to have at most 1 amour and 1 artifact
			buying new will be replace existing one without regaining money
	character
		speed
		Name
		price
		attack
		defense
		health
	equipment
		amour
			speed
			Name
			price
			attack
			defense
			health
		artifacts
			speed
			Name
			price
			attack
			defense
			health
		increase character value by 20% of item value
War
	War style
		 the characters take turns to attack, in the order of speed.
		 The person who declares war will take the first turn. The character of that player with the highest speed will attack first, followed by the character of the opposing player with the highest speed, and so on and so forth. 
		 Each player will be given 10 turns. A player wins a game by killing all characters of the opposing army. If both teams are standing at the end of 10 turns, the battle is considered to be a draw. 
		 The attack of Archers, Knights, Mages, and Mythical Creatures will be targeted on the character of the opposing team with the lowest defence. When one of these characters attacks, the health of the defender will be reduced by (0.5*(attack value of attacking character) - 0.1*(defence value of defending character)). 
		 However, a healer’s attack is focused on healing one’s own army instead of damaging the enemy. 
		 Therefore, when a healer attacks, the health of the character in their own army with the lowest health is increased by 0.1*(attack value of healer).
		 Once a character’s health reaches 0, it dies and cannot be revived till the battle ends. After a battle ends, all the characters are restored to their state before the battle. 
		 Among characters with the same speed, the priority order of attacking is as follows. 
		 Healer < Mage < Mythical Creature < Knight < Archer 
		 Among characters with the same defence, the priority order of receiving attacks is as follows. Mage < Knight< Archer < Mythical Creature < Healer 
	Home grounds
		Each player can select a home ground for their battles. When a player challenges another player to combat, the battle will occur at the home ground of the player who is being challenged. Home grounds can be of four types: Hillcrest, Marshland, Desert, and Arcane. Further, the characters can be divided into four categories as Highlanders, Marshlanders, SunChildren, and Mystics. Highlanders: Shooter, Ranger, Cavalier, Zoro, Enchanter, Conjurer, Medic Marshlanders: Squire, Swiftblade, Warlock, Alchemist, Basilisk, Hydra Sunchildren: Sunfire, Zing, Templar, Soother, Lightbringer, Dragon, Phoenix Mystics: Saggitarius, Illusionist, Eldritch, Saint, Pegasus In Hillcrest, the attack and defence of highlanders increase by 1 while the speed of marshlanders and sunchildren decrease by 1. When attacking in Hillcrest, each highlander can follow each of their turns with a bonus turn with 20% of their attack power. In Marshland, the defence of marshlanders increases by 2 while the attack of sunchildren decreases by 1. The speed of mystics also decreases by 1. In Desert, the health of marshlanders decreases by 1 while the attack of sunchildren increases by 1. In Arcane, the attack of mystics increases by 2 while the speed and defence of highlanders and marshlanders decrease by 1. When attacking in arcane, mystics increase their own health by 10% after each of their turns.
	