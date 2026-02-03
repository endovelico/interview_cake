## Implement a Queue Using Two Stacks

Implement a **queue** using **two stacks**.

Your queue should support the following operations:

- `enqueue`
- `dequeue`

The queue must follow **First-In, First-Out (FIFO)** semantics.

---

### Optimization Requirement

Optimize for the **total time cost** of **m calls** on your queue, where:

- `m` can be any mix of `enqueue` and `dequeue` operations.

---

### Assumptions

- You already have a **stack implementation**.
- The stack supports:
    - `push` in **O(1)** time
    - `pop` in **O(1)** time
