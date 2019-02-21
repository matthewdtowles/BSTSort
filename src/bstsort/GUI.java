package bstsort;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * GUI and main class for BST Sort
 * 
 * @author matthew.towles
 * @date Feb 15, 2019
 */
public class GUI extends javax.swing.JFrame {
    
    /**
     * GUI Instance Vars
     */
    private JRadioButton ascendingButton;
    private JRadioButton descendingButton;
    private JRadioButton fractionButton;
    private JRadioButton integerButton;
    private ButtonGroup numTypeButtons;
    private JPanel numTypePanel;
    private ButtonGroup sortOrderButtons;
    private JPanel sortOrderPanel;
    private JTextField sortedField;
    private JLabel sortedLabel;
    private JButton submitButton;
    private JTextField unsortedField;
    private JLabel unsortedLabel;
    
    
    /**
     * Constructor for GUI
     */
    public GUI() {
        super("Binary Search Tree Sort");
        init();
    }
    
    
    /**
     * Build the GUI
     */
    private void init() {
        initVars();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        sortedField.setEditable(false);
        
        // set up sort order radio button section
        sortOrderPanel.setBorder(BorderFactory.createTitledBorder("Sort Order"));
        sortOrderButtons.add(ascendingButton);
        ascendingButton.setSelected(true);
        sortOrderButtons.add(descendingButton);
        GroupLayout sortOrderPanelLayout = new GroupLayout(sortOrderPanel);
        sortOrderPanel.setLayout(sortOrderPanelLayout);
        sortOrderPanelLayout.setHorizontalGroup(
            sortOrderPanelLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING
            )
            .addGroup(
                sortOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sortOrderPanelLayout.createParallelGroup(
                    GroupLayout.Alignment.LEADING
                )
                .addComponent(descendingButton)
                .addComponent(ascendingButton))
                .addContainerGap(66, Short.MAX_VALUE)
            )
        );
        sortOrderPanelLayout.setVerticalGroup(
            sortOrderPanelLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING
            )
            .addGroup(
                GroupLayout.Alignment.TRAILING, 
                sortOrderPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ascendingButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descendingButton)
                .addContainerGap()
            )
        );

        // set up num type radio button section
        numTypePanel.setBorder(BorderFactory.createTitledBorder("Numeric Type"));
        numTypeButtons.add(integerButton);
        integerButton.setSelected(true);
        numTypeButtons.add(fractionButton);
        GroupLayout numTypePanelLayout = new GroupLayout(numTypePanel);
        numTypePanel.setLayout(numTypePanelLayout);
        numTypePanelLayout.setHorizontalGroup(
            numTypePanelLayout.createParallelGroup(
                GroupLayout.Alignment.LEADING
            )
            .addGroup(
                numTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    numTypePanelLayout.createParallelGroup(
                        GroupLayout.Alignment.LEADING
                    )
                    .addComponent(fractionButton)
                    .addComponent(integerButton)
                )
                .addContainerGap(87, Short.MAX_VALUE)
            )
        );
        numTypePanelLayout.setVerticalGroup(
            numTypePanelLayout.createParallelGroup(
                    GroupLayout.Alignment.LEADING
            )
            .addGroup(
                numTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(integerButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fractionButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            )
        );
        
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(
                        layout.createSequentialGroup()
                        .addGap(145, 244, Short.MAX_VALUE)
                        .addComponent(
                            numTypePanel, 
                            GroupLayout.PREFERRED_SIZE, 
                            GroupLayout.DEFAULT_SIZE, 
                            GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addGroup(
                        layout.createSequentialGroup()
                        .addComponent(
                            sortOrderPanel, 
                            GroupLayout.PREFERRED_SIZE, 
                            GroupLayout.DEFAULT_SIZE, 
                            GroupLayout.PREFERRED_SIZE
                        )
                        .addGap(0, 0, Short.MAX_VALUE)
                    )
                    .addGroup(
                        layout.createSequentialGroup()
                        .addComponent(unsortedLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unsortedField)
                    )
                    .addGroup(
                        layout.createSequentialGroup()
                        .addComponent(sortedLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortedField)
                    )
                )
                .addContainerGap()
            )
            .addGroup(
                GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(164, 164, 164))
        );

        layout.linkSize(
            SwingConstants.HORIZONTAL, 
            new Component[] {
                numTypePanel, sortOrderPanel
            }
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(unsortedLabel)
                    .addComponent(
                        unsortedField, 
                        GroupLayout.PREFERRED_SIZE, 
                        GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGap(18, 18, 18)
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(sortedLabel)
                    .addComponent(
                        sortedField, 
                        GroupLayout.PREFERRED_SIZE, 
                        GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.PREFERRED_SIZE
                    )
                )
                .addPreferredGap(
                    LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE
                )
                .addComponent(submitButton)
                .addGap(18, 18, 18)
                .addGroup(
                    layout.createParallelGroup(
                            GroupLayout.Alignment.LEADING, 
                            false
                    )
                    .addComponent(
                        numTypePanel, 
                        GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.DEFAULT_SIZE, 
                        Short.MAX_VALUE
                    )
                    .addComponent(
                        sortOrderPanel, 
                        GroupLayout.DEFAULT_SIZE, 
                        GroupLayout.DEFAULT_SIZE, 
                        Short.MAX_VALUE
                    )
                )
                .addContainerGap()
            )
        );
        
        submitButton.addActionListener(this::submitButtonActionPerformed);
        setVisible(true);
        pack();
    }
    
    
    /**
     * Initialize instance variables for GUI
     */
    private void initVars() {
        unsortedLabel = new JLabel("Original List");
        unsortedField = new JTextField();
        sortedLabel = new JLabel("Sorted List");
        sortedField = new JTextField();
        submitButton = new JButton("Perform Sort");
        sortOrderPanel = new JPanel();
        sortOrderButtons = new ButtonGroup();
        descendingButton = new JRadioButton("Descending");
        ascendingButton = new JRadioButton("Ascending");
        numTypePanel = new JPanel();
        numTypeButtons = new ButtonGroup();
        integerButton = new JRadioButton("Integer");
        fractionButton = new JRadioButton("Fraction");
    }
    
    
    /**
     * Event listener for submit button
     * @param ev 
     */
    private void submitButtonActionPerformed(ActionEvent ev) {
        
        // save user input to values
        String[] values = unsortedField.getText().split(" ");
        
        // create empty BST
        // check radio buttons
        if (integerButton.isSelected()) {
            BinarySearchTree<Integer> bst = new BinarySearchTree<>();
            
            // loop through values and add to bst
            for (String val : values) {
                // bst .add/.insert Integer.parseInt(val)
            }
        } else {
            //BinarySearchTree<Fraction> bst = new BinarySearchTree<>();
            
            // loop thru vals and add to bst
            for (String val : values) {
                // Fraction f = new Fraction(val);
                // bst add/insert f
            }
        }
    }
    
    
    /**
     * Main
     * @param args 
     */
    public static void main(String[] args) {
        
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        
        bst.add(15);
        bst.add(10);
        bst.add(20);
        bst.add(8);
        bst.add(16);
        bst.add(24);
        bst.add(17);
        
//        System.out.println(bst.getRoot().getValue());
//        System.out.println(bst.getRoot().getLeft().getValue() + " - " + bst.getRoot().getRight().getValue());
//        System.out.println(bst.getRoot().getLeft().getLeft().getValue()
//                + " - - " +
//                bst.getRoot().getRight().getLeft().getValue()
//                + " - - " + bst.getRoot().getRight().getRight().getValue()
//        );
//        System.out.println(" - - - " + bst.getRoot().getRight().getLeft().getRight().getValue());
//        
//        System.out.println("----------------------------------------------");
        
//        bst.inorderTraversal(bst.getRoot());
        bst.postorderTraversal(bst.getRoot());
        System.out.println(bst.getSortedValues());
        //new GUI();
    }
}
