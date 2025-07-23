# 📦 File Packer & Unpacker

## 🔍 Overview

**File Packer & Unpacker** is an industrial-level Java project designed to **pack multiple files from a directory into a single file** (along with metadata), and **unpack** them later using that metadata. This project helps in file management, encryption, and integrity verification using a simplified GUI and core Java functionalities.

---

## 🎯 Features

- User Authentication with limited login attempts
- Password validation with background thread (including Caps Lock status check)
- Pack multiple files from a directory into a single encrypted file
- Store file metadata (name, size, checksum) in log files
- Unpack files from the packed file using metadata
- GUI interface for easy operation
- Cross-platform compatibility using Java

---

## 🧱 Technologies Used

- **Java (AWT/Swing)** – Frontend and Backend
- **Java I/O & Multithreading**
- **Checksum & Encryption**
- **File Handling and Logging**

---

## 🚀 How it Works

### ✅ Authentication

- Only authenticated users can access the features.
- Default credentials:  
  - **Username:** `MarvellousAdmin`  
  - **Password:** `MarvellousAdmin`  
- Maximum of 3 login attempts allowed.

### 📦 Packing Process

- Input: Directory path & output file name
- Actions:
  - Traverse directory
  - Store each file’s data and metadata (name, size, checksum)
  - Encrypt and write to a single packed file
  - Log file information

### 📂 Unpacking Process

- Input: Packed file name
- Actions:
  - Authenticate using a "Magic Number"
  - Extract metadata
  - Recreate original files
  - Display unpacking summary


