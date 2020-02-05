import UIKit
import MultiPlatformLibrary

@UIApplicationMain
class AppDelegate: NSObject, UIApplicationDelegate {
    
    var window: UIWindow?
    
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]? = nil) -> Bool {
        let app = App()
        print("app \(app)")
        let initial = app.setup()
        print("initial \(initial)")

        let screen = app.rootScreen.instantiate()
        print("screen \(screen)")
        let rootViewController = screen.viewController
        print("rootViewController \(rootViewController)")

        window = UIWindow(frame: UIScreen.main.bounds)
        window?.rootViewController = rootViewController
        print("mkav")
        window?.makeKeyAndVisible()
        print("return")

        return true
    }
}
