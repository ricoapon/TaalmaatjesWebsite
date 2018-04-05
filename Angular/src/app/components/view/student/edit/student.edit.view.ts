import {Component, OnInit} from "@angular/core";
import {ActivatedRoute, Router} from "@angular/router";
import {StudentDVO} from "../../../../valueobject/dvo/student.dvo";
import {AlertModel} from "../../../block/alert/alert.model";
import {GenderUtil} from "../../../../util/gender.util";
import {StudentService} from "../../../../services/student.service";

@Component({
  selector: 'app-student-edit-view',
  templateUrl: './student.edit.view.html'
})
export class StudentEditView implements OnInit {
  public alertModel = new AlertModel();
  public student: StudentDVO;
  public genders = GenderUtil.genders;

  ngOnInit(): void {
    this.student = new StudentDVO();
  }

  constructor(private studentService: StudentService,
              private router: Router, private route: ActivatedRoute) { }

  didHttpRequest() {
    this.router.navigate(['../' + this.student.externalIdentifier], {relativeTo: this.route});
  }

  onBack() {
    this.router.navigate(['../'], {relativeTo: this.route});
  }
}