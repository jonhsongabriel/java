import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Forme extends JFrame {
    private JTextField nomField, ageField, contactField;
    private JButton addButton, afficherButton;
    private DefaultTableModel model; // Utiliser DefaultTableModel pour gérer les données du tableau

    public Forme() {
        setTitle("Formulaire et tableau");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);

        // Créer les champs de formulaire
        JLabel nomLabel = new JLabel("Nom : ");
        nomField = new JTextField(10);
        JLabel ageLabel = new JLabel("Âge : ");
        ageField = new JTextField(10);
        JLabel contactLabel = new JLabel("Contact");
        contactField = new JTextField(10);

        // Créer les boutons
        addButton = new JButton("Ajouter");
        afficherButton = new JButton("Afficher");

        // Ajouter les composants au panneau principal
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(nomLabel);
        panel.add(nomField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(contactLabel);
        panel.add(contactField);
        panel.add(addButton);
        panel.add(afficherButton);

        // Créer le modèle de données pour le tableau
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("Nom");
        columnNames.add("Âge");
        columnNames.add("Contact");
        model = new DefaultTableModel(columnNames, 0); // 0 pour le nombre initial de lignes

        // Créer le tableau avec le modèle de données
        JTable table = new JTable(model);

        // Ajouter le tableau à un JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Ajouter des écouteurs d'événements aux boutons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ajouterDonnees();
            }
        });

        afficherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                afficherTableau();
            }
        });

        // Ajouter le panneau et le JScrollPane au cadre
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void ajouterDonnees() {
        String nom = nomField.getText();
        String age = ageField.getText();
        String contact = contactField.getText();

        // Ajouter les données au modèle de données du tableau
        model.addRow(new Object[]{nom, age, contact});
    }

    private void afficherTableau() {
        // Afficher les données du modèle de données du tableau
        for (int row = 0; row < model.getRowCount(); row++) {
            for (int col = 0; col < model.getColumnCount(); col++) {
                System.out.print(model.getValueAt(row, col) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Forme form = new Forme();
                form.setVisible(true);
            }
        });
    }
}
