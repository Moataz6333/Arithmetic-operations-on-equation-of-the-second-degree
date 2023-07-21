# Arithmetic-operations-on-equation-of-the-second-degree

# Node class
the node class of the linked list contains a couple of integers **coff** for the coefficient of the term of eq and **pow** for the power of the term
and a the constructor of the class

# Linked List Class
this a regular linkedlist class implementation contains some extra methods :
### add()
this method takes two parameters **(the coffiecent of the equation , the power of the equation)**.

### removeFirst()
to remove the first node of the linked list

### removeLast()
to remove the last node of the linked list

### removeAt()
this method takes an integer parametar **Pos** and delet the node at the position **Pos** at the linked list

### getPos()
this method  takes a parameter of Type **Node** and returns the index of this node in the linked list

### Display()
To display the equation in the linked list

# The Main Class
the main class contain the main method and the operation methods of the porgramme and it consist of :

### evaluate()

evaluate method takes two parameters of **LinkedList** Type and **Double** *X* 
to evaluate the nodes of the linked list with the double x.
Then it prints the result with **Display()** method.

### multOfTwoPolly()

this method taking a two parametars of type **LinkedList** for getting the multiplication of these linked lists and for simplefication them in a new linked list **N**
the display it with **Display()** method.

### addition()

this method  taking a two parametars of type **LinkedList** for getting the summation of the two linked lists then put the result in the new linked list **N**
the display it with **Display()** method.

### substract()

this method looks like **addition()** but we subtract the two linked list with changing the sign of the 2nd linkedlist's coeffitions


### isContainX()

this method help us to know is the term of the equation that contain the sympol **X** or not
the method of type **boolean** and take a parametar of type **String**
so it returns **true** if it contains , **false** if not.










