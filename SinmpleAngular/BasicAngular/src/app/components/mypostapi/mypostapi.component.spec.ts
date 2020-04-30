import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MypostapiComponent } from './mypostapi.component';

describe('MypostapiComponent', () => {
  let component: MypostapiComponent;
  let fixture: ComponentFixture<MypostapiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MypostapiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MypostapiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
