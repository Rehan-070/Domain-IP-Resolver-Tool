# 🌍 Domain & IP Resolver Tool (Java)

A Java console application that resolves domain names to IP addresses, retrieves all IPs for a domain, and displays local host information using Java Networking API.

---

## 🚀 Features

- 🌐 Convert domain name to IP address
- 📡 Retrieve all IP addresses of a domain
- 🖥️ Display local host information
- 🔎 Uses `InetAddress` class
- ⚡ Simple console-based networking tool

---

## 🧠 How It Works

1. User enters a domain name.
2. Program uses `InetAddress.getByName()` to get its IP.
3. Uses `InetAddress.getAllByName()` to retrieve all IPs of a domain.
4. Uses `InetAddress.getLocalHost()` to display local machine details.
5. Prints all results in structured format.

---

## 🗂️ Project Files

N1.java  

Main file contains domain resolution and host lookup logic.

---

## 🛠️ Requirements

Make sure you have **Java JDK** installed.

Check Java version:

`java -version`

Check Java compiler:

`javac -version`

---

## ▶️ How to Run

# compile the file  
`javac N1.java`

# run the program  
`java N1`

---

## 🧪 Example Run

ENETR THE DOMAIN NAME :- google.com  

IP ADDRESS IS :- google.com/142.250.xxx.xxx  

---------------------------------------------------  

Multiple IP addresses of google.com  

---------------------------------------------------  

Local Host Information  

---------------------------------------------------  

---

## 📚 Technologies Used

`Java`  
`java.net.InetAddress`  
`java.util.Scanner`  

---

## 🤝 Contributing

- Fork the repository
- Add reverse DNS lookup
- Add ping functionality
- Add error handling improvements
- Add GUI version
- Create a pull request

---

## 📜 License

This project is open-source and free to use for learning purposes.


---

## Author

Rehan Shaikh
