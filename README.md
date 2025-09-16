# Text Editor

A simple, lightweight text editor built with Java Swing that provides essential text editing functionality with a clean, intuitive interface.

## Features

- **File Operations**
  - Create new files
  - Open existing text files
  - Save files with custom names

- **Text Editing**
  - Cut, Copy, Paste operations
  - Select All functionality
  - Real-time text editing
  - Scrollable text area

- **User Interface**
  - Clean, modern GUI built with Java Swing
  - Menu-driven interface
  - File browser integration
  - Cross-platform compatibility

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any IDE that supports Java (IntelliJ IDEA, Eclipse, VS Code, etc.) or command line

### Running the Application

#### Method 1: Command Line
```bash
# Clone the repository
git clone https://github.com/anirudhsom123/TextEditor.git

# Navigate to the project directory
cd TextEditor

# Compile the Java file
javac TextEditor.java

# Run the application
java TextEditor
```

#### Method 2: IDE
1. Clone or download the repository
2. Open the project in your preferred Java IDE
3. Run the `TextEditor.java` file
4. The application window will appear

## File Structure
```
TextEditor/
â”‚
â”œâ”€â”€ TextEditor.java          # Main application file
â”œâ”€â”€ README.md               # Project documentation
â””â”€â”€ screenshots/            # Application screenshots
    â”œâ”€â”€ Screenshot-2025-09-17-at-12.08.03-AM.jpeg
    â”œâ”€â”€ Screenshot-2025-09-17-at-12.08.35-AM.jpeg
    â”œâ”€â”€ Screenshot-2025-09-17-at-12.09.18-AM.jpeg
    â””â”€â”€ Screenshot-2025-09-17-at-12.10.17-AM.jpeg
```

## Usage

### File Operations
- **New Window**: Click File â†’ New Window to create a new document
- **Open File**: Click File â†’ Open File to browse and open existing text files
- **Save File**: Click File â†’ Save File to save your work with a custom filename

### Text Editing
- **Cut**: Select text and click Edit â†’ Cut (or Ctrl+X)
- **Copy**: Select text and click Edit â†’ Copy (or Ctrl+C)  
- **Paste**: Click Edit â†’ Paste (or Ctrl+V) to paste copied text
- **Select All**: Click Edit â†’ Select All (or Ctrl+A) to select all text
- **Close**: Click Edit â†’ Close to exit the application

## Technical Details

- **Language**: Java
- **GUI Framework**: Java Swing
- **File I/O**: Uses FileReader, BufferedReader, FileWriter, BufferedWriter
- **Event Handling**: ActionListener interface implementation
- **Layout**: BorderLayout with custom component styling

## Key Components

- `JFrame`: Main application window
- `JMenuBar`: Menu bar containing File and Edit menus
- `JTextArea`: Main text editing area
- `JScrollPane`: Provides scrolling functionality
- `JFileChooser`: File browser for open/save operations

## Future Enhancements

- [ ] Syntax highlighting for different programming languages
- [ ] Find and replace functionality
- [ ] Recent files menu
- [ ] Font size and style customization
- [ ] Dark/Light theme toggle
- [ ] Line numbers display
- [ ] Auto-save feature

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

**Anirudh Som**
- GitHub: [@anirudhsom123](https://github.com/anirudhsom123)

## Acknowledgments

- Built using Java Swing framework
- Inspired by classic text editors like Notepad
- Thanks to the Java community for excellent documentation and examples

---

*Feel free to star â­ this repository if you found it helpful!*
