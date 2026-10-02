# 🐍 Snake and Ladder Game

An empty template module for designing and implementing the classic **Snake and Ladder** Low-Level Design (LLD) problem in Java 21.

---

## 📋 Problem Requirements & Suggested Guidelines

Design a console-based Snake and Ladder board game:

1. **Board**:
   - Configurable board size (e.g., $100$ cells or $N$ cells).
   - Configurable number of Snakes and Ladders placed across cells.
   - A snake head must be at a higher cell number than its tail.
   - A ladder bottom must be at a lower cell number than its top.
   - Validate boundaries and ensure no infinite cycles between jumpers.

2. **Dice**:
   - Configurable dice count (1 or more dice, 1–6 faces).
   - Pluggable rolling strategy (fair random vs deterministic/rigged for testing).

3. **Players & Turns**:
   - 2 or more players taking turns in round-robin fashion.
   - Track each player's current position and win status.

4. **Game Rules & Variations**:
   - **Exact Landing Rule**: A player must land exactly on the final cell (e.g. 100) to win; overshooting rolls are discarded.
   - **Extra Turn**: Rolling a 6 awards an extra roll.
   - **Consecutive Sixes Rule**: Three consecutive 6s cancel the turn.
   - **Leaderboard**: Rank players as they finish.

---

## 🚀 How to Run

### Run Application:
```bash
mvn exec:java -pl snake-and-ladder
```

### Run Tests:
```bash
mvn test -pl snake-and-ladder
```
