package com.ustudents.engine.input;

import com.ustudents.engine.Game;
import com.ustudents.engine.input.empty.EmptyInput;
import com.ustudents.engine.input.glfw.GLFWInput;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class Input {
    private static EmptyInput inputManager;

    public static void initialize() {
        switch (Game.get().getInputSystemType()) {
            case Empty:
                inputManager = new EmptyInput();
                break;
            case GLFW:
                inputManager = new GLFWInput();
                break;
        }

        inputManager.initialize();
    }

    public static boolean isKeyDown(int key) {
        return inputManager.isKeyDown(key);
    }

    public static boolean isKeyUp(int key) {
        return inputManager.isKeyUp(key);
    }

    public static boolean isKeyPressed(int key) {
        return inputManager.isKeyPressed(key);
    }

    public static boolean isKeyReleased(int key) {
        return inputManager.isKeyReleased(key);
    }

    public static boolean isMouseDown(int button) {
        return inputManager.isMouseDown(button);
    }

    public static boolean isMouseUp(int key) {
        return inputManager.isMouseDown(key);
    }

    public static boolean isMousePressed(int button) {
        return inputManager.isMouseDown(button);
    }

    public static boolean isMouseRelease(int button) {
        return inputManager.isMouseDown(button);
    }

    public static int getScroll() {
        return inputManager.getScroll();
    }

    public static Vector2f getMousePos() {
        return inputManager.getMousePos();
    }

    public static boolean isMouseInViewRect(Vector4f viewRect) {
        return inputManager.isMouseInViewRect(viewRect);
    }

    public static boolean isMouseInWorldViewRect(Vector4f viewRect) {
        return inputManager.isMouseInWorldViewRect(viewRect);
    }

    public static void recalculateMousePosition() {
        inputManager.recalculateMousePosition();
    }
}
