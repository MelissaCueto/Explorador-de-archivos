import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.tree.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bms
 */
public class Explorador extends javax.swing.JFrame {

    /**
     * Creates new form Explorador
     */
    String lastSearchInfo = "";

    public Explorador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItemNewFile = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTreeFiles = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelPath = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenuItemNewFile.setText("Nuevo Archivo");
        jMenuItemNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewFileActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItemNewFile);

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("C:/");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("User");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Documents");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("program.js");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pictures");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("nudes.png");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("System32");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("virus.bat");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTreeFiles.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTreeFiles.setEditable(true);
        jTreeFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeFilesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTreeFilesMouseReleased(evt);
            }
        });
        jTreeFiles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTreeFilesKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTreeFiles);

        jButton1.setText("Buscar Archivo/Carpeta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldSearch.setToolTipText("");
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Ruta del archivo seleccionado: ");

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Abrir nueva ventana");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Crear Archivo");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Eliminar Archivo");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem6.setText("Mostrar detalles de última busqueda");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem7.setText("Acerca de..");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenu4.setText("Desarrollado por");

        jMenuItem8.setText("Melissa Cueto");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Iván E. Sánchez");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("César Huerta");
        jMenu4.add(jMenuItem10);

        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelPath, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * EVENTO: Botón Crear Nuevo Archivo/Carpeta
     */
    private void jMenuItemNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewFileActionPerformed
        DefaultTreeModel tree = (DefaultTreeModel) jTreeFiles.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getRoot();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTreeFiles.getLastSelectedPathComponent();
        DefaultMutableTreeNode newFile = new DefaultMutableTreeNode("Nuevo Archivo");
        DefaultMutableTreeNode parent = (selectedNode == null) ? root : selectedNode;
        parent.add(newFile);
        tree.reload(parent);
        jTreeFiles.startEditingAtPath(new TreePath(newFile.getPath()));
    }//GEN-LAST:event_jMenuItemNewFileActionPerformed
    /**
     * EVENTO: Mouse Click Derecho
     */
    private void jTreeFilesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeFilesMouseReleased
        if (jTreeFiles.getPathForLocation(evt.getX(), evt.getY()) == null) {
            jTreeFiles.clearSelection();
        }

        if (evt.isPopupTrigger()) {
            jPopupMenu.show(jTreeFiles, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTreeFilesMouseReleased
    /**
     * EVENTO: Mouse Click Izquierdo
     */
    private void jTreeFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeFilesMouseClicked
        TreePath SelectedNode = jTreeFiles.getPathForLocation(evt.getX(), evt.getY());
        if (SelectedNode == null) {
            jTreeFiles.clearSelection();
            jLabelPath.setText("");
        } else {
            jLabelPath.setText(SelectedNode.toString());
        }
    }//GEN-LAST:event_jTreeFilesMouseClicked
    /**
     * EVENTO: Botón Eliminar Archivo/Carpeta
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DefaultTreeModel tree = (DefaultTreeModel) jTreeFiles.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTreeFiles.getLastSelectedPathComponent();
        if (selectedNode != null) {
            TreeNode parent = selectedNode.getParent();
            selectedNode.removeFromParent();
            tree.reload(parent);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
     * EVENTO: Botón Buscar Archivo/Carpeta
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTreeModel tree = (DefaultTreeModel) jTreeFiles.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getRoot();
        TreePath filePath = find(root, jTextFieldSearch.getText());
        if (filePath == null) {
            JOptionPane.showMessageDialog(null, "No se encontro el archivo o carpeta especificada");
        } else {
            jTreeFiles.expandPath(filePath);
            jTreeFiles.clearSelection();
            jTreeFiles.addSelectionPath(filePath);
            jLabelPath.setText(filePath.toString());
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * EVENTO: Tecla presionada
     */
    private void jTreeFilesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTreeFilesKeyPressed
        // Verificamos si la tecla que se pulso fue la tecla DELETE
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            jMenuItem1ActionPerformed(null);
        }
    }//GEN-LAST:event_jTreeFilesKeyPressed
    /**
     * EVENTO: Botón Acerca de..
     */
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String[] options = new String[]{"Ver código en Github"};
        int buttonPressed = JOptionPane.showOptionDialog(null, "Versión 0.1 Alpha (DESCONTINUADO)\nMIT License", "Acerca de..",
                JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                null, options, null);
        if (buttonPressed == 0) {
            try {
                Desktop.getDesktop().browse(new URL("https://github.com/mazyvan/Explorador-de-archivos").toURI());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    /**
     * EVENTO: Botón Mostrar Detalles Última Busqueda
     */
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JOptionPane.showMessageDialog(null, lastSearchInfo);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    /**
     * EVENTO: Botón Salir
     */
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        // Verificamos si la tecla que se pulso fue la tecla ENTER
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1ActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        // --START-- CÓDIGO PARA USAR INTERFAZ POR DEFECTO DEL SISTEMA
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "LookAndFeel not found");
        }
        // --END--

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Explorador().setVisible(true);
            }
        });
    }

    /**
     * El metodo find busca un nodo específico en el árbol que recibe como
     * parametro
     *
     * @param root
     * @param nameToSearch
     * @return La ruta del nodo en el que obtuvo coinicdencia o null en caso de
     * no obtener ninguna
     */
    public TreePath find(DefaultMutableTreeNode root, String nameToSearch) {
        // Obtiene todos los nodos dentro del árbol que se envió como paramtro
        Enumeration<DefaultMutableTreeNode> nodesList = root.breadthFirstEnumeration();
        lastSearchInfo = "";
        while (nodesList.hasMoreElements()) {
            // Almacena el nodo actual
            DefaultMutableTreeNode node = nodesList.nextElement();
            lastSearchInfo += "\n" + Arrays.toString(node.getPath());
            // Obtiene el nombre del nodo y lo compara con la cadena de texto
            if (node.toString().equalsIgnoreCase(nameToSearch)) {
                return new TreePath(node.getPath());
            }
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPath;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemNewFile;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTree jTreeFiles;
    // End of variables declaration//GEN-END:variables
}
