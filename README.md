# coding-challenge-smartbear-britishtime

Convert `hh:mm` (24-hour format) into **British spoken form**.

Examples:
- `01:00` → `one o'clock`
- `04:15` → `quarter past four`
- `19:30` → `half past seven`
- `07:35` → `twenty-five to eight`
- `18:43` → `six forty-three`
- `00:00` → `midnight`
- `12:00` → `noon`

## How it works
- If minutes are a **multiple of 5**, the time is displayed in **colloquial style** (`past / to / quarter / half`).  
- If minutes are **not a multiple of 5**, the time is displayed in **digital style** (`six thirty-two`).  
- Special cases: `00:00 → midnight`, `12:00 → noon`.

## Prerequisites
- Java 8 or higher
- Maven 3.x (to run tests or build with Maven)
- IntelliJ IDEA or any other Java IDE 

## Run the program
### Option 1: Run inside IntelliJ / IDE
1. Open the project in IntelliJ (or your IDE).  
2. Navigate to `src/main/java/britishtime/Main.java`.  
3. Right-click on the class and select **Run 'Main.main()'**.  
4. Enter a time (e.g. `07:35`) when prompted.
<img width="612" height="109" alt="image" src="https://github.com/user-attachments/assets/4464f7a6-930c-4d97-8f29-fcdd9b2dffbd" />

### Option 2: Run with Maven
From the project root:

```bash
mvn clean install exec:java -Dexec.mainClass=britishtime.Main

