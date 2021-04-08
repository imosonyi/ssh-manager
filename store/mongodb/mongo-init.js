db.createUser({
    user: "ssh-manager_store",
    pwd: "ssh-manager_store",
    roles: [
        {
            role: "readWrite",
            db: "ssh-manager_store"
        }
    ]
});
