# ⏰ Java Alarm Clock

A simple **Java-based alarm clock** that allows you to set a custom alarm time (`HH:MM:SS`) and plays a `.wav` sound file when the alarm goes off.

---

## 🚀 Features
- Set alarm using `HH:MM:SS` format
- Displays live countdown with current time updating every second
- Plays a `.wav` file as the alarm sound
- Stop alarm by pressing **Enter**

---

## 🛠️ Technologies Used
- **Java SE**
- **java.time** for date and time handling
- **javax.sound.sampled** for audio playback

---

## 📂 Project Structure
```

src/
├── Main.java         # Entry point, takes user input and sets alarm
└── AlarmClock.java   # Handles countdown and sound playback

````

---
## 📷 Example Run

````
Enter an alarm time (HH:MM:SS): 07:30:00
Alarm set for 07:30

07:29:56 (countdown started)

**Alarm Noises**
Press *Enter* to stop the alarm:
````
(At this point, your .wav file will start playing until you press Enter)

---

## 👨‍💻 Author
Made by **Vivek Bhatt**
