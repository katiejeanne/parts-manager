
# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS


## C.  Customize the HTML user interface for your customer’s application. 
*The user interface should include the shop name, the product names, and the names of the parts.*

*Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.*

- In mainscreen.html I modified the shop name on lines 14 and 19.
- I changed "Parts" to "Building Supplies" on line 21.
- I changed "Products" to "Furniture Pieces" on line 53.**


## D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers. 
*Include navigation to and from the “About” page and the main screen.*

- I added about.html to templates (src/main/resources/templates/about.html). 
- I added AboutController to controllers (src/main/java/com/example/demo/controllers/AboutController.java).
- I added a link to the about page on mainscreen.html on line 21.


## E.  Add a sample inventory appropriate for your chosen store to the application. 
*You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.*

*Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.*

- I added a list of parts in an addParts function found on line 81 of BootStrapData.
- I added a list of products in an addProducts function found on line 141 of BootStrapData.
- I added an if statement to check if the parts list is empty on line 60 of BootStrapData.
- I added an if statement to check if the products list is empty on line 69 of BootStrapData.


## F.  Add a “Buy Now” button to your product list. 
*Your “Buy Now” button must meet each of the following parameters: The “Buy Now” button must be next to the buttons that update and delete products.  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts. Display a message that indicates the success or failure of a purchase.*


## G.  Modify the parts to track maximum and minimum inventory.
*Accomplish this by doing the following: 1. Add additional fields to the part entity for maximum and minimum inventory. 2. Modify the sample inventory to include the maximum and minimum fields. 3. Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values. 4. Rename the file the persistent storage is saved to. 5. Modify the code to enforce that the inventory is between or at the minimum and maximum value.*


## H.  Add validation for between or at the maximum and minimum fields. 
*The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.*


## I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


## J.  Remove the class files for any unused validators in order to clean your code.
