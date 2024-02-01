package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MaintainanceFeaturesSpecialView {
    private JFrame frame;
    private JButton viewItemsInDatabaseButton;
    private JButton registerItemInDatabaseButton;
    private JButton changeItemPriceButton;
    private JButton changeItemCaloriesButton;
    private JButton setSlotButton;
    private JButton restockSlotButton;
    private JButton setMoneyButton;
    private JButton containersButton;
    private JButton compoundPriceButton;
    private JButton setItemSellableStatusButton;

    private JButton backButton;

    public MaintainanceFeaturesSpecialView(){
        frame = new JFrame("Feature Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS)); // Set vertical BoxLayout


        JPanel panel2 = new JPanel();
        viewItemsInDatabaseButton = new JButton("View Items in Database");
        panel2.add(viewItemsInDatabaseButton);

        JPanel panel3 = new JPanel();
        registerItemInDatabaseButton = new JButton("Register an Item in Database");
        panel3.add(registerItemInDatabaseButton);

        JPanel panel4 = new JPanel();
        changeItemPriceButton = new JButton("Change Item Price");
        panel4.add(changeItemPriceButton);

        // Add four more buttons
        JPanel panel5 = new JPanel();
        changeItemCaloriesButton = new JButton("Change Item Calories");
        panel5.add(changeItemCaloriesButton);

        JPanel panel6 = new JPanel();
        setSlotButton = new JButton("Set Slot");
        panel6.add(setSlotButton);

        JPanel panel7 = new JPanel();
        restockSlotButton = new JButton("Restock Slot");
        panel7.add(restockSlotButton);

        JPanel panel8 = new JPanel();
        setMoneyButton = new JButton("Set Money");
        panel8.add(setMoneyButton);

        JPanel panel9 = new JPanel();
        containersButton = new JButton("Containers Menu");
        panel9.add(containersButton);

        JPanel panel10 = new JPanel();
        compoundPriceButton = new JButton("Set Compound price");
        panel10.add(compoundPriceButton);

        JPanel panel11 = new JPanel();
        setItemSellableStatusButton = new JButton("Set Item Sellable/Unsellable");
        panel11.add(setItemSellableStatusButton);

        JPanel panel12 = new JPanel();
        backButton = new JButton("Back");
        panel12.add(backButton);


        // Add the button panels to the frame
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);
        frame.add(panel10);
        frame.add(panel11);
        frame.add(panel12);

        frame.setVisible(false);
    }

    public void setViewItemsInDatabaseButtonEventListener(ActionListener actionListener){
        this.viewItemsInDatabaseButton.addActionListener(actionListener);
    }

    public void setRegisterItemInDatabaseButtonEventListener(ActionListener actionListener){
        this.registerItemInDatabaseButton.addActionListener(actionListener);
    }

    public void setChangeItemPriceButtonListener(ActionListener actionListener){
        this.changeItemPriceButton.addActionListener(actionListener);
    }

    public void setChangeItemCaloriesButtonListener(ActionListener actionListener){
        this.changeItemCaloriesButton.addActionListener(actionListener);
    }
    public void setSetMoneyButtonEventListener(ActionListener actionListener){
        this.setMoneyButton.addActionListener(actionListener);
    }

    public void setSetSlotButtonEventListener(ActionListener actionListener){
        this.setSlotButton.addActionListener(actionListener);
    }


    public void setRestockSlotButtonEventListener(ActionListener actionListener){
        this.restockSlotButton.addActionListener(actionListener);
    }

    public void setContainersButtonActionListener(ActionListener actionListener){
        this.containersButton.addActionListener(actionListener);
    }

    public void setCompoundPriceButton(ActionListener actionListener){
        this.compoundPriceButton.addActionListener(actionListener);
    }

    public void setSetItemSellableStatusButton(ActionListener actionListener){
        this.setItemSellableStatusButton.addActionListener(actionListener);
    }


    public void changeVisibility() {
        if (this.frame.isVisible()) {
            this.frame.setVisible(false);
        } else {
            this.frame.setVisible(true);
        }
    }
    public void setBackButtonEventListener(ActionListener actionListener){
        this.backButton.addActionListener(actionListener);
    }




}
