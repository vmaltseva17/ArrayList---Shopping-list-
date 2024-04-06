
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingCartClient
    // declares class

{
    public static void main(String[] args)
    // main method for the whole program
    {
       // Item itemOne = new Item("Dyson Hairdryer", 3);
        // creates a new object of type "item" which is a class previously defined and gives it a name and a price
       // Item itemTwo = new Item("Cartier Watch", 3);
       // Item itemThree = new Item("Birkin Kelly", 3);

        //   ItemOrder itemoneOrder = new ItemOrder(itemOne, 5);
        // creates a new itemorder object which is a prevusoly defined class and assings the item object to it as a parameter
      //  ItemOrder itemtwoOrder = new ItemOrder(itemTwo, 5);
      //  ItemOrder itemthreeOrder = new ItemOrder(itemThree, 5);
     //  ItemOrder itemfourOrder = new ItemOrder(itemThree, 5);
     //   ShoppingCart shopCart = new ShoppingCart();
        // creates a new object from the shopping cart array class called shopping cart
     //   shopCart.add(itemoneOrder);
     //   shopCart.add(itemtwoOrder);
     //   shopCart.add(itemthreeOrder);
        // this adds the three item orders to the shopping cart array
    //    System.out.println("The total cost of your order will be :" + shopCart.getTotalCost());
        // prints the total cost of the shopping cart by using the previously defined get total cost method

      //  System.out.println("This item will be removed from your card.");
      //  shopCart.remove(itemoneOrder);
        // removes the item one order from the shopping cart
      //  System.out.println("The total cost of your order will be:" + shopCart.getTotalCost());
     //   System.out.println("Checking for item three order in the shopping cart");
      //  boolean isFound = shopCart.
                // searches for itemthree order in the shopping cart and stores the variable in the shopcart object which is an object of the shopping cart array class
                    //    searchItem(itemthreeOrder);
     //   if (isFound)
            // if it is true (meaning that the two equal each other)
       //     System.out.println("Yes");
      //  else
      //      System.out.println("No");
        // if there is no such object in the shopping cart
        // basically turning the baby array into a boolean true or false
        //  System.out.println("Checking for item four order in the shopping cart");
    //    isFound = shopCart.searchItem(itemfourOrder);
     //   if (isFound)
      //      System.out.println(":yes");
      //  else
        //    System.out.println(":No");

        // making the GUI

        // Frame
        JFrame frame = new JFrame("THE EVERYTHING SHOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // creating the panel

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.PINK);

        // add a welcome label

        JLabel welcomeLabel = new JLabel("WELCOME TO THE SHOP OF EVERYTHING");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(welcomeLabel, BorderLayout.NORTH);

        // add button to proceed to purchasing

        JButton proceedButton = new JButton("PROCEED TO PURCHASING");
        mainPanel.add(proceedButton, BorderLayout.CENTER);

        // add action listener to proceed button

        // Add action listener to proceed button
        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create checkbox panel
                JPanel checkboxPanel = new JPanel();
                checkboxPanel.setLayout(new GridLayout(0, 1));

                // Add checkboxes
                JCheckBox dysonCheckbox = new JCheckBox("Dyson Hairdryer");
                JCheckBox cartierCheckbox = new JCheckBox("Cartier Watch");
                JCheckBox birkinCheckbox = new JCheckBox("Birkin Kelly");
                dysonCheckbox.setSelected(true);
                cartierCheckbox.setSelected(true);
                birkinCheckbox.setSelected(true);
                dysonCheckbox.setVisible(false);
                cartierCheckbox.setVisible(false);
                birkinCheckbox.setVisible(false);
                checkboxPanel.add(dysonCheckbox);
                checkboxPanel.add(cartierCheckbox);
                checkboxPanel.add(birkinCheckbox);

                // Add dropdown menu
                JComboBox<Integer> quantityDropdown = new JComboBox<>();
                for (int i = 1; i <= 10; i++) {
                    quantityDropdown.addItem(i);

                    // add calculate total button
                    JButton calculateButton = new JButton("Calculate my total");
                    checkboxPanel.add(calculateButton);

                    // add action listener to calculate button
                    calculateButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int totalCost = 0;
                            int quantity = (int) quantityDropdown.getSelectedItem();
                            if (dysonCheckbox.isSelected()) {
                                totalCost += 1000 * quantity;
                            }
                            if (cartierCheckbox.isSelected()) {
                                totalCost += 1000 * quantity;
                            }
                            if (birkinCheckbox.isSelected()) {
                                totalCost += 1000 * quantity;
                            }
                            JOptionPane.showMessageDialog(null, "Your total cost is: $" + totalCost);
                        }

                    });

                    JOptionPane.showMessageDialog(null, checkboxPanel, "Select Items", JOptionPane.PLAIN_MESSAGE);
                }
        frame.add(mainPanel);
        frame.setVisible(true);}})
            ;}}




