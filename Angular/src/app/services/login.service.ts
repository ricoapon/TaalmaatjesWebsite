import {HttpHeaders} from "@angular/common/http";
import {MyHttpClient} from "./base/myhttpclient.service";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs/Observable";
import {Observer} from "rxjs/Observer";

@Injectable()
export class LoginService {
  loggedIn: boolean = false;

  constructor(private myHttpClient: MyHttpClient) { }

  login(username: string, password: string) {
    // HttpHeaders is an immutable object, so we need to append.
    var httpHeaders = new HttpHeaders()
      .append("Authorization", 'Basic ' + btoa(username + ':' + password));

    var promise = this.myHttpClient.get('version/secured', httpHeaders);
    promise.subscribe(
      (response: Response) => {
        this.loggedIn = true;
      },
      (error: Error) => {
        this.loggedIn = false;
      });
    return promise;
  }

  isLoggedIn(): boolean {
    return this.loggedIn;
  }

  isLoggedInObservable() : Observable<boolean> {
    // No need to try logging in if we are already logged in.
    if (this.loggedIn === true) {
      return Observable.create((observer: Observer<boolean>) => {
        observer.next(true);
        observer.complete();
      });
    }

    return Observable.create((observer: Observer<boolean>) => {
      // If we can already login using cached values, the header doesn't even matter.
      this.login('', '').subscribe(
        () => {
          this.loggedIn = true;
          observer.next(true);
          observer.complete();
        },
        () => {
          this.loggedIn = false;
          observer.error(false);
          observer.complete();
        }
      )
    });
  }
}