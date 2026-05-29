package Pertemuan14;

public class BinaryTree17 {
    Node17 root;

    public BinaryTree17() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa17 mahasiswa) {
        Node17 newNode = new Node17(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node17 current = root;
            while (true) {
                Node17 parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node17 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node17 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node17 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node17 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node17 getSuccessor(Node17 del) {
        Node17 successor = del.right;
        Node17 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // Jika leaf node
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild)
                        parent.left = null;
                    else
                        parent.right = null;
                }
            }
            // 1 Anak (kanan)
            else if (current.left == null) {
                if (current == root)
                    root = current.right;
                else {
                    if (isLeftChild)
                        parent.left = current.right;
                    else
                        parent.right = current.right;
                }
            }
            // 1 Anak (Kiri)
            else if (current.right == null) {
                if (current == root)
                    root = current.left;
                else {
                    if (isLeftChild)
                        parent.left = current.left;
                    else
                        parent.right = current.left;
                }
            }
            // 2 Anak
            else {
                Node17 successor = getSuccessor(current);
                if (current == root)
                    root = successor;
                else {
                    if (isLeftChild)
                        parent.left = successor;
                    else
                        parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }

}
