static int B;
static int H;
static boolean flag;

static
{
flag = false;
Scanner scanner = new Scanner(System.in);
B = scanner.nextInt();
H = scanner.nextInt();

if (B > 0 && H > 0)
flag = true;
else
System.out.println("java.lang.Exception: Breadth and height must be positive");
}