package Menu.View;

import Draw_in_javaSwing.JPanel_Draw;
import Menu.Controller.Menu_Listener;
import Menu.Controller.Menu_Mouse_Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Menu_View extends JFrame {
    private final JToolBar jToolBar;
    private JLabel jLabel;
    public JPopupMenu jPopupMenu;

    public Menu_View() throws HeadlessException {
        this.setSize(500,500);
        this.setTitle("Menu");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Menu_Listener menuListener = new Menu_Listener(this);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jMenu_file = new JMenu("File");
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N); //KeyEvent: gạch dưới
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_new.addActionListener(menuListener);

        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_open.addActionListener(menuListener);

        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
        jMenuItem_exit.addActionListener(menuListener);

        jMenu_file.add(jMenuItem_new);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator(); // gạch ngang
        jMenu_file.add(jMenuItem_exit);

        JMenu jMenu_help = new JMenu("Help");
        jMenu_help.setMnemonic(KeyEvent.VK_L);
        //jMenu_help.setDisplayedMnemonicIndex(0);

        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome", KeyEvent.VK_W);
        jMenuItem_welcome.addActionListener(menuListener);
        jMenuItem_welcome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));

        jMenu_help.add(jMenuItem_welcome);

        JMenu jMenu_view = new JMenu("View");
        JCheckBoxMenuItem jCheckBoxMenuItem_toolbar = new JCheckBoxMenuItem("Toolbar");
        jCheckBoxMenuItem_toolbar.addActionListener(menuListener);
        jMenu_view.add(jCheckBoxMenuItem_toolbar);

        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_view);
        jMenuBar.add(jMenu_help);

        this.setJMenuBar(jMenuBar);

        jToolBar = new JToolBar();

        JButton jButton_Undo = new JButton("Undo");
        jButton_Undo.setToolTipText("Khôi phục");
        jButton_Undo.addActionListener(menuListener);
        JButton jButton_Redo = new JButton("Redo");
        jButton_Redo.addActionListener(menuListener);
        JButton jButton_Copy = new JButton("Copy");
        jButton_Copy.setToolTipText("Sao chép");
        jButton_Copy.addActionListener(menuListener);
        JButton jButton_Cut = new JButton("Cut");
        jButton_Cut.setToolTipText("Cắt");
        jButton_Cut.addActionListener(menuListener);
        JButton jButton_Paste = new JButton("Paste");
        jButton_Paste.setToolTipText("Dán");
        jButton_Paste.addActionListener(menuListener);
        jToolBar.add(jButton_Undo);
        jToolBar.add(jButton_Redo);
        jToolBar.add(jButton_Copy);
        jToolBar.add(jButton_Cut);
        jToolBar.add(jButton_Paste);

        jPopupMenu = new JPopupMenu();

        JMenu jMenuPopupFont = new JMenu("Font");
        JMenuItem jMenuItemType = new JMenuItem("Type");
        jMenuItemType.addActionListener(menuListener);
        JMenuItem jMenuItemSize = new JMenuItem("Size");
        jMenuItemSize.addActionListener(menuListener);
        jMenuPopupFont.add(jMenuItemType);
        jMenuPopupFont.add(jMenuItemSize);

        JMenuItem jMenuItemCut = new JMenuItem("Cut");
        jMenuItemCut.addActionListener(menuListener);
        JMenuItem jMenuItemCopy = new JMenuItem("Copy");
        jMenuItemCopy.addActionListener(menuListener);
        JMenuItem jMenuItemPaste = new JMenuItem("Paste");
        jMenuItemPaste.addActionListener(menuListener);

        jPopupMenu.add(jMenuPopupFont);
        jPopupMenu.add(jMenuItemCut);
        jPopupMenu.add(jMenuItemCopy);
        jPopupMenu.add(jMenuItemPaste);
        this.add(jPopupMenu);

        Menu_Mouse_Listener menuMouseListener = new Menu_Mouse_Listener(this);
        this.addMouseListener(menuMouseListener);

        Font font = new Font("Arial",Font.BOLD,40);
        jLabel = new JLabel();
        jLabel.setFont(font);

        this.setLayout(new BorderLayout());
        this.add(jLabel,BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void setTextJLabel(String s) {
        this.jLabel.setText(s);
    }

    public void enableJToolbar() {
        this.add(jToolBar,BorderLayout.NORTH);
        this.refresh();
    }

    public void disableJToolbar() {
        this.remove(jToolBar);
        this.refresh();
    }

    public void refresh() {
        this.pack(); // đóng gói
        this.setSize(500,500);
    }
}
