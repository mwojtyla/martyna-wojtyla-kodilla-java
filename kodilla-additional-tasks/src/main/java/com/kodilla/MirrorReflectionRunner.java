package com.kodilla;

public class MirrorReflectionRunner {
    public static void main(String[] args) {
        MirrorReflection wordAfterReflection = new MirrorReflection();

        System.out.println(wordAfterReflection.mirrorReflection("Adam"));
        System.out.println(wordAfterReflection.mirrorReflection("Ewa"));

        System.out.println(wordAfterReflection.mirrorReflection("Java"));

        System.out.println(wordAfterReflection.mirrorReflection("Programming"));


    }
}
