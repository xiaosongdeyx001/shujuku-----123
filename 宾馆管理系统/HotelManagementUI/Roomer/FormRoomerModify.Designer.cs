namespace HotelManagementUI.Roomer
{
    partial class FormRoomerModify
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormRoomerModify));
            this.button3_close = new System.Windows.Forms.Button();
            this.button2_clr = new System.Windows.Forms.Button();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.textBoxAddress = new System.Windows.Forms.TextBox();
            this.textBox3_remark = new System.Windows.Forms.TextBox();
            this.textBoxPhone = new System.Windows.Forms.TextBox();
            this.textBoxName = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.button1_modify = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // button3_close
            // 
            this.button3_close.Location = new System.Drawing.Point(288, 312);
            this.button3_close.Name = "button3_close";
            this.button3_close.Size = new System.Drawing.Size(75, 23);
            this.button3_close.TabIndex = 11;
            this.button3_close.Text = "退出(&Q)";
            this.button3_close.UseVisualStyleBackColor = true;
            this.button3_close.Click += new System.EventHandler(this.button3_close_Click);
            // 
            // button2_clr
            // 
            this.button2_clr.Location = new System.Drawing.Point(177, 312);
            this.button2_clr.Name = "button2_clr";
            this.button2_clr.Size = new System.Drawing.Size(75, 23);
            this.button2_clr.TabIndex = 10;
            this.button2_clr.Text = "清除(&C)";
            this.button2_clr.UseVisualStyleBackColor = true;
            this.button2_clr.Click += new System.EventHandler(this.button2_clr_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.textBoxAddress);
            this.groupBox1.Controls.Add(this.textBox3_remark);
            this.groupBox1.Controls.Add(this.textBoxPhone);
            this.groupBox1.Controls.Add(this.textBoxName);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Location = new System.Drawing.Point(27, 22);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(373, 263);
            this.groupBox1.TabIndex = 12;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "住客信息";
            // 
            // textBoxAddress
            // 
            this.textBoxAddress.Location = new System.Drawing.Point(135, 111);
            this.textBoxAddress.Name = "textBoxAddress";
            this.textBoxAddress.Size = new System.Drawing.Size(100, 21);
            this.textBoxAddress.TabIndex = 10;
            // 
            // textBox3_remark
            // 
            this.textBox3_remark.Location = new System.Drawing.Point(131, 162);
            this.textBox3_remark.Multiline = true;
            this.textBox3_remark.Name = "textBox3_remark";
            this.textBox3_remark.Size = new System.Drawing.Size(205, 86);
            this.textBox3_remark.TabIndex = 7;
            // 
            // textBoxPhone
            // 
            this.textBoxPhone.Location = new System.Drawing.Point(131, 75);
            this.textBoxPhone.Name = "textBoxPhone";
            this.textBoxPhone.Size = new System.Drawing.Size(121, 21);
            this.textBoxPhone.TabIndex = 5;
            this.textBoxPhone.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBoxPhone_KeyPress);
            // 
            // textBoxName
            // 
            this.textBoxName.Location = new System.Drawing.Point(131, 39);
            this.textBoxName.Name = "textBoxName";
            this.textBoxName.Size = new System.Drawing.Size(121, 21);
            this.textBoxName.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(28, 39);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(41, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "姓名：";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(28, 162);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(41, 12);
            this.label4.TabIndex = 3;
            this.label4.Text = "备注：";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(28, 78);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "电话：";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(28, 114);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(41, 12);
            this.label3.TabIndex = 2;
            this.label3.Text = "住址：";
            // 
            // button1_modify
            // 
            this.button1_modify.Location = new System.Drawing.Point(57, 312);
            this.button1_modify.Name = "button1_modify";
            this.button1_modify.Size = new System.Drawing.Size(75, 23);
            this.button1_modify.TabIndex = 11;
            this.button1_modify.Text = "修改(&M)";
            this.button1_modify.UseVisualStyleBackColor = true;
            this.button1_modify.Click += new System.EventHandler(this.button1_modify_Click);
            // 
            // FormRoomerModify
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.AliceBlue;
            this.ClientSize = new System.Drawing.Size(426, 363);
            this.Controls.Add(this.button1_modify);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.button3_close);
            this.Controls.Add(this.button2_clr);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "FormRoomerModify";
            this.Text = "住客信息修改";
            this.Load += new System.EventHandler(this.FormRoomerModify_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button button3_close;
        private System.Windows.Forms.Button button2_clr;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.TextBox textBoxAddress;
        private System.Windows.Forms.TextBox textBox3_remark;
        private System.Windows.Forms.TextBox textBoxPhone;
        private System.Windows.Forms.TextBox textBoxName;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button button1_modify;
    }
}