import mongoose from 'mongoose';

// 1. Connect to MongoDB
await mongoose.connect('mongodb://127.0.0.1:27017/bookstore');
console.log("Connected to MongoDB!");

// 2. Define Schema and Model
const bookSchema = new mongoose.Schema({
  title: String,
  author: String,
  price: Number
});

const Book = mongoose.model('Book', bookSchema);

// 3. Add a book
async function addBook(title, author, price) {
  const book = new Book({ title, author, price });
  await book.save();
  console.log("Book Added:", book);
}

// 4. List all books
async function listBooks() {
  const books = await Book.find();
  console.log("All Books:", books);
}

// 5. Find a book by title
async function findBook(title) {
  const book = await Book.findOne({ title });
  console.log("Book Found:", book);
}

// 6. Update book price
async function updateBookPrice(title, newPrice) {
  const updatedBook = await Book.findOneAndUpdate(
    { title },
    { price: newPrice },
    { new: true }
  );
  console.log("Updated Book:", updatedBook);
}

// Demo workflow
await addBook("Node.js Basics", "John Doe", 499);
await addBook("MongoDB Mastery", "Jane Smith", 699);

await listBooks();
await findBook("Node.js Basics");
await updateBookPrice("MongoDB Mastery", 799);

await listBooks();

process.exit();
