package com.hunterscode.datastructures;


    class DocumentState {
        String content;

        DocumentState(String content) {
            this.content = content;
        }
    }

     class TextEditor {
        private Node head;
        private Node current;

        // Insert a new state into the list
        public void insertState(DocumentState state) {
            Node newState = new Node(state);
            if (current != null) {
                current.next = newState;
                newState.prev = current;
            } else {
                head = newState;
            }
            current = newState;
        }

        // Move to the previous state (undo)
        public DocumentState undo() {
            if (current != null && current.prev != null) {
                current = current.prev;
                return current.data;
            }
            return null;
        }

        // Move to the next state (redo)
        public DocumentState redo() {
            if (current != null && current.next != null) {
                current = current.next;
                return current.data;
            }
            return null;
        }

        public static void main(String[] args) {
            TextEditor editor = new TextEditor();

            // Simulating the changes in the document
            editor.insertState(new DocumentState("First state"));
            editor.insertState(new DocumentState("Second state"));
            editor.insertState(new DocumentState("Third state"));

            // Performing an undo operation
            DocumentState undoState = editor.undo();
            if (undoState != null) {
                System.out.println("Undo performed: " + undoState.content);
            }

            // Performing a redo operation
            DocumentState redoState = editor.redo();
            if (redoState != null) {
                System.out.println("Redo performed: " + redoState.content);
            }
        }
    }

    class Node {
        DocumentState data;
        Node prev;
        Node next;

        Node(DocumentState data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


