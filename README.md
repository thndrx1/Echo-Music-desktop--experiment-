<div align="center">
  <img src="assets/Echo-new.png" alt="Echo Music Logo" width="120"/>

  <h1>Echo Music — PC/KMP Migration Experiment</h1>

  <p>
    An experimental fork exploring the feasibility of bringing Echo Music to Desktop using Kotlin Multiplatform.
  </p>
</div>

---

> [!NOTE]
> **This is an experimental fork of Echo Music by Adytia.**
>
> The purpose of this fork is to investigate how much of Echo Music's existing code and logic can be reused for a Desktop version through Kotlin Multiplatform.
>
> This is **not an official PC version of Echo Music**, nor does it represent a commitment to develop or maintain one.
>
> The experiment may change, stop, or be abandoned depending on technical feasibility.

## About

This project started as an experiment to determine whether Echo Music can be adapted to run on Desktop without rewriting the entire application from scratch.

The main focus is **Kotlin Multiplatform (KMP)** and how much of the existing Android architecture can be shared or migrated.

The initial question is simple:

> **How far can Echo Music be taken toward Desktop using its existing codebase?**

## Goals

- Evaluate Kotlin Multiplatform compatibility.
- Reuse as much existing logic as possible.
- Identify Android-specific dependencies and APIs.
- Determine which components can become shared code.
- Implement Desktop-specific components where necessary.
- Explore the possibility of a Desktop UI.
- Document the difficulties and results of the migration.

## Approach

The migration will be done incrementally.

1. Establish a working Android baseline.
2. Add Kotlin Multiplatform/Desktop support.
3. Attempt to compile the existing project for Desktop.
4. Identify and classify migration blockers.
5. Adapt or replace Android-specific components.
6. Test shared logic independently from the UI.
7. Explore Desktop UI and playback if the underlying migration proves viable.

No complete rewrite is planned at the beginning. The first objective is to determine whether the existing project can realistically be adapted.

## Current Status

| Component | Status |
|---|---|
| Original Android project | Working baseline |
| Kotlin Multiplatform | Experimental |
| Desktop compilation | Not yet evaluated |
| Desktop runtime | Not yet evaluated |
| Shared logic | Under investigation |
| Desktop playback | Not implemented |
| Desktop UI | Not implemented |
| Production release | Not planned |

## Experimental Fork

This repository is a **fork of the original Echo Music project**.

The original project was created and maintained by **Adytia**.

This fork is maintained by **thndrx1** for experimentation and research into a possible Desktop/Kotlin Multiplatform migration.

**Original repository:**  
https://github.com/EchoMusicApp/Echo-Music

## Disclaimer

This repository does not represent an official Desktop release of Echo Music.

The purpose of this fork is experimentation, technical research, and evaluation of the feasibility of a Desktop migration.

There is no guarantee that the experiment will result in a functional Desktop application.

---

<div align="center">
  <p><i>Experimental work by thndrx1 · Original project by Adytia</i></p>
</div>